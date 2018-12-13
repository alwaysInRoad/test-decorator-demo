package com.test.decorator.test;

import java.util.ArrayList;
import java.util.List;
import com.test.component.SortingWithSets;
import com.test.concrete_component.SortingSetsBySex;
import com.test.decorator.impl.SortingSetsByAge;
import com.test.decorator.impl.SortingSetsByName;
import com.test.pojo.User;

public class Test {
	
	public static void main(String[] args) {
		//加入下面就是源代码部分
		List<User> list = new ArrayList<User>();
		User user = new User("张三", "15", "男");
		User user1 = new User("李四", "11", "男");
		User user2 = new User("李四", "10", "男");
		User user3 = new User("李四", "16", "男");
		User user4 = new User("李四", "10", "男");
		User user5 = new User("张曼玉2", "10", "女");
		User user6 = new User("张曼玉1", "10", "女");
		User user7 = new User("张曼玉3", "10", "女");
		User user8 = new User("李四", "10", "男");
		list.add(user);
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		list.add(user5);
		list.add(user6);
		list.add(user7);
		list.add(user8);
		//这里就是我要加的排序代码  
		SortingWithSets sort = new SortingSetsByAge(new SortingSetsBySex());
		SortingWithSets sort1 = new SortingSetsByName(sort);
		//这里的调用顺序是：先调用性别类中的根据性别排序，再调用根据年龄排序，最后调用根据姓名排序
		sort1.sortingSets(list);
		list.forEach(a->System.out.println(a));
	}
	
}
