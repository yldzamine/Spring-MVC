package com.amine;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amine.model.Personel;

public class merkez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
	    Personel personel = context.getBean("beanPersonelProxy", Personel.class);
	    Personel personel2 = context.getBean("beanPersonel2", Personel.class);
	    
	    personel.Adsoyadkontrol();
	    personel.selamlama("SELAM MİLLET");
	    personel.Personelbilgiver();
	    
	    context.close();
	
	}

}
