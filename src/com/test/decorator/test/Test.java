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
		//�����������Դ���벿��
		List<User> list = new ArrayList<User>();
		User user = new User("����", "15", "��");
		User user1 = new User("����", "11", "��");
		User user2 = new User("����", "10", "��");
		User user3 = new User("����", "16", "��");
		User user4 = new User("����", "10", "��");
		User user5 = new User("������2", "10", "Ů");
		User user6 = new User("������1", "10", "Ů");
		User user7 = new User("������3", "10", "Ů");
		User user8 = new User("����", "10", "��");
		list.add(user);
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		list.add(user5);
		list.add(user6);
		list.add(user7);
		list.add(user8);
		//���������Ҫ�ӵ��������  
		SortingWithSets sort = new SortingSetsByAge(new SortingSetsBySex());
		SortingWithSets sort1 = new SortingSetsByName(sort);
		//����ĵ���˳���ǣ��ȵ����Ա����еĸ����Ա������ٵ��ø����������������ø�����������
		sort1.sortingSets(list);
		list.forEach(a->System.out.println(a));
	}
	
}
