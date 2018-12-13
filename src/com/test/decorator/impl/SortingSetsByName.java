package com.test.decorator.impl;

import java.util.Comparator;
import java.util.List;
import com.test.component.SortingWithSets;
import com.test.decorator.AbstractSortingWithSets;
import com.test.pojo.User;

public class SortingSetsByName extends AbstractSortingWithSets {
	//���췽������Ҫ����װ�ε���
	public SortingSetsByName(SortingWithSets sortingWithSets) {
		super(sortingWithSets);
	}
	
	@Override
	public void sortingSets(List<User> list) {
		//���ñ�װ�ε�������򷽷�
		super.sortingSets(list);
		//ʵ���Լ��������
		list.sort(Comparator.comparing(user->((User)user).getName()));
	}

}
