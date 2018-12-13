package com.test.concrete_component;

import java.util.Comparator;
import java.util.List;
import com.test.component.SortingWithSets;
import com.test.pojo.User;

public class SortingSetsBySex implements SortingWithSets {

	@Override
	public void sortingSets(List<User> list) {
		list.sort(Comparator.comparing(user->((User)user).getSex()).reversed());
	}

}
