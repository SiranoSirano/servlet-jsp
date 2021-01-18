
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectEmployeeSample {

	public static void main(String[] args) {
		// DBに接続,接続先DBのアドレス、ユーザー名sa、パスワードはなしなので""を入れる
		try (Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","")){
			//			SQLのSELECTを準備
			String sql = "SELECT ID,NAME,AGE FROM EMPLOYEE";
			//			SQLをDBに届けるPreparedStatementインスタンスを取得する
			PreparedStatement pStmt = conn.prepareStatement(sql);
			//			SELECTを実行して結果表のResultSetを取得する
			//			ResultSetインスタンスにSELECT文の結果が格納される
			ResultSet rs = pStmt.executeQuery();

			//			結果表に格納されているレコードを表示する
			//			rs.next()はResultSetのインスタンスのrsがある限り、結果表の取り出すレコードを一つ進める
			while(rs.next()) {
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");
				//				取り出す対象のレコードの各列の値をrsのインスタンスで型名　列の項目名で取り出す

				//				取得データの出力
				System.out.println("ID:" + id);
				System.out.println("名前:" + name);
				System.out.println("年齢:" + age + "\n");
				//				"\n"は改行を示す
			}
		}catch(SQLException e){
			e.printStackTrace();
		}

	}

}
