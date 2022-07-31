package com.GAC2.Problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Enter total no of floors");
		Scanner sc = new Scanner(System.in);
		int totalFloors = sc.nextInt();

		Map<Integer, Integer> floorMap = new LinkedHashMap<Integer, Integer>();
		List<Integer> floorList = new ArrayList<Integer>();
		for (int i = 0; i < totalFloors; i++) {
			System.out.println("Enter floor to build on day " + (i + 1));
			
			int dayFloorToBuild = sc.nextInt();
			floorMap.put(i + 1, dayFloorToBuild);

		}
		sc.close();
		
		for (Map.Entry<Integer, Integer> mapItr : floorMap.entrySet()) {

			if (totalFloors == mapItr.getValue()) {
				totalFloors = totalFloors - 1;
				System.out.println("Day " + mapItr.getKey());
				System.out.print(mapItr.getValue() + " ");
				if (!floorList.isEmpty()) {
					while (!floorList.isEmpty() && floorList.get(0) == totalFloors) {
						System.out.print(floorList.get(0) + " ");
						floorList.remove(Integer.valueOf(floorList.get(0)));
						totalFloors = totalFloors - 1;
						continue;
					}
				}
				System.out.println();
			} else {
				System.out.println("Day " + mapItr.getKey());
				System.out.println();
				floorList.add(mapItr.getValue());
				Collections.sort(floorList, Collections.reverseOrder());
			}
		}
		if (!floorList.isEmpty()) {
			floorList.forEach(i -> System.out.print(i + " "));
		}
	}
}

