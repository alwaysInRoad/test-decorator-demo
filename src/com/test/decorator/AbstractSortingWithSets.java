package com.test.decorator;

import java.util.List;
import com.test.component.SortingWithSets;
import com.test.pojo.User;

public abstract class AbstractSortingWithSets implements SortingWithSets{
	//持有一个需要装饰的类
	private SortingWithSets sortingWithSets;

	public AbstractSortingWithSets(SortingWithSets sortingWithSets) {
		super();
		this.sortingWithSets = sortingWithSets;
	}

	@Override
	public void sortingSets(List<User> list) {
		//调用被装饰的类的方法
		sortingWithSets.sortingSets(list);
	}
	
}
