package package9syou.model;

public class SiteEVLogic {
	public void retweet(SiteEV site) {
		int count = site.getRetweet();
		site.setRetweet(count +1);
		}
	public void favorite(SiteEV site) {
		int count = site.getFavorite();
		site.setFavorite(count +1);
	}
}
