package di_pack;

import io.cucumber.core.backend.ObjectFactory;
import io.cucumber.picocontainer.PicoFactory;
import page_actions.Add_product_pa;
import page_actions.Collection_point_pa;
import page_actions.Create_order_pa;
import page_actions.Driver_launch_pa;
import page_actions.Search_create_order_pa;
import page_actions.Select_brand_pa;
import page_actions.Select_product_pa;

public class Di implements ObjectFactory {


	PicoFactory delegate=new PicoFactory();

	public Di() {
		addClass(Driver_launch_pa.class);
		addClass(Create_order_pa.class);
		addClass(Select_brand_pa.class);
		addClass(Search_create_order_pa.class);
		addClass(Select_product_pa.class);
		addClass(Add_product_pa.class);
		addClass(Collection_point_pa.class);
		
	}


	@Override
	public void start() {
		delegate.start();
	}

	@Override
	public void stop() {
		delegate.stop();
	}

	@Override
	public boolean addClass(Class<?> clazz) {
		return delegate.addClass(clazz);
	}

	@Override
	public <T> T getInstance(Class<T> clazz) {
		return delegate.getInstance(clazz);
	}
}
