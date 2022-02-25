
public class Client {

	public static void main(String[] args) {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		System.out.println("Speed:" + bugattiVeyronAdapter.getSpeed());
		System.out.println("Price:"+bugattiVeyronAdapter.getPrice());
	}
}
