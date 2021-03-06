package com.test.decorator.impl;

import java.util.Comparator;
import java.util.List;
import com.test.component.SortingWithSets;
import com.test.decorator.AbstractSortingWithSets;
import com.test.pojo.User;

public class SortingSetsByAge extends AbstractSortingWithSets {
	//构造方法，需要传被装饰的类
	public SortingSetsByAge(SortingWithSets sortingWithSets) {
		super(sortingWithSets);
	}

	@Override
	public void sortingSets(List<User> list) {
		//调用被装饰的类的排序方法
		super.sortingSets(list);
		//同时自己再实现自己排序规则
		list.sort(Comparator.comparing(user->((User)user).getAge()));
	}

}
