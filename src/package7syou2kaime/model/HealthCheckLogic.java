package package7syou2kaime.model;

public class HealthCheckLogic {
	public void execute(Health health) {

		//BMIを算出して設定
		double weight = health.getWeight();
		double height = health.getHeight();
		//身長(cm)を(m)にして掛ける
		double bmi = weight / (((height/100.0)*height)/100);
		health.setBmi(bmi);

		//BMI指数から体型を判定して設定
		String bodyType;
		if(bmi < 18.5) {
			bodyType ="やせ型";
		}else if(bmi < 25) {
			bodyType = "ふつう";
		}else {
			bodyType ="肥満";
		}
		health.setBodyType(bodyType);
	}
}
