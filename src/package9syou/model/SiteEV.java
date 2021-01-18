package package9syou.model;
import java.io.Serializable;
//サイトの評価に関するJavaBeans

public class SiteEV implements Serializable {
	//javabeansを作る、フィールドはprivate、クラスはpublic,
	//リツイート数なのでフィールドのカプセル化を図る
	private int retweet;
	//ファボ数
	private int favorite;

	//
	public SiteEV() {
		retweet = 0;
		favorite = 0;
	}

	public int getRetweet() {return retweet;}
	public void setRetweet(int retweet) {this.retweet = retweet;}
	public int getFavorite() {return favorite;}
	public void setFavorite(int favorite) {this.favorite = favorite;}

}
