package com.test.decorator;

import java.util.List;
import com.test.component.SortingWithSets;
import com.test.pojo.User;

public abstract class AbstractSortingWithSets implements SortingWithSets{
	//����һ����Ҫװ�ε���
	private SortingWithSets sortingWithSets;

	public AbstractSortingWithSets(SortingWithSets sortingWithSets) {
		super();
		this.sortingWithSets = sortingWithSets;
	}

	@Override
	public void sortingSets(List<User> list) {
		//���ñ�װ�ε���ķ���
		sortingWithSets.sortingSets(list);
	}
	
}
