package com.monster.demo.optional;

import java.util.Optional;

public class MyOptional {
	
	public static void main(String[] args) {
		
		//申明一个空的Optional
		Optional<Car> car=Optional.empty();
		
		Car secondCar=new Car();
		//这里是依据一个非空值创建Optional，如果secondCar是null，会抛出一个异常
		Optional<Car> optSecondCar=Optional.of(secondCar);
		
		//创建一个可以接受null的Optional
		Optional<Car> thirdCar=Optional.ofNullable(secondCar);

		
		Insurance insurance=null;
		Optional<Insurance> optInsurance=Optional.ofNullable(insurance);
		Optional<String> name=optInsurance.map(Insurance::getName);
		
		Person person=null;
		Optional<Person> optPerson=Optional.ofNullable(person);
		optPerson.flatMap(Person::getCar).flatMap(Car::getInsurance).map(Insurance::getName).orElse("Unkown");
	}

}
