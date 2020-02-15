package com.sg.assigment.bonus.language.demo;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Rooster  {
	@Autowired
	protected MessageSource messageSource;

	public void sing() {
		System.out.println(messageSource.getMessage("rooster.sing", null,
				new Locale("vi")));
	}

}
