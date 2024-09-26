package com.stream.mcqs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Tester 
{
	

	//private static final String RED = "\033[1;31m"; // RED
	//private static final String RESET = "\033[0m"; // Text Reset
	
	@SuppressWarnings({ "unused", "unchecked" })
	public static void main(String[] args)
	{
		List<Employee> list = EmployeeAdder.addDetails();
		Set<Integer> set = new HashSet<>();	
		Set<String> set2 = new HashSet<>();
//		list.stream().filter(f->f.getGender().equals("Female")).forEach(System.out::println);
//      list.stream().filter(a->a.getAge()>30).forEach(System.out::println);
//      list.stream().filter(a->a.getSalary()> 50000).forEach(System.out::println);
//		list.stream().map(name -> name.getName()).forEach(System.out::println);
//	    OptionalDouble average = list.stream().mapToDouble(Employee::getSalary).average();
//	    System.out.println(average);
		
//		OptionalDouble max = list.stream().mapToDouble(Employee::getSalary).max();
//		System.out.println(max);
//		list.stream().collect(Collectors.groupingBy(Employee::getGender)).forEach((k,v) -> System.out.println(k+" : "+v));
		
		/*double sum = list.stream()
				.mapToDouble(Employee::getSalary)
				.sum();
		System.out.println("Sum : "+sum);
		*/

		
//		list.stream().sorted((a,b)->a.getName().compareTo(b.getName())).forEach(System.out::println);
//		list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
//      list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
//        int orElseThrow = list.stream().mapToInt(Employee::getAge).max().orElseThrow();
//        
//        Employee employee = list.stream().max((a,b) -> a.getAge()- b.getAge()).get();
//        System.out.println(employee +"   "+employee);
		
//		double sum = list.stream().mapToDouble(Employee::getSalary).sum();
//		System.out.println(sum);
//        Optional<Employee> max = list.stream().sorted(Comparator.comparing(Employee::getSalary)).max((a,b)->a.getAge()-b.getAge());
//		
//        System.out.println(max);
//		list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.summingDouble(Employee::getSalary)))
//		.forEach((key,value)->System.out.println(key +" - "+value));

		
		//list.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
		
		/*System.out.println("*******************************************************");
		list.stream().sorted((o1, o2) -> -(int)(o1.getSalary()+o2.getSalary()))
		.limit(5).forEach(System.out::println);*/


		/*List<Integer> aslist = Arrays.asList(1,2,3,4,5);
		Stream<Integer> limit = aslist.stream().limit(3);
		limit.forEach(System.out::println);*/
		
	//	list.stream().filter(k -> !set.add(k.getAge())).forEach(System.out::println);
//	    List<Integer> duplicate = Arrays.asList(1,2,3,4,1,1,6,8,9,2,1);
//	    
//	    duplicate.stream().filter(d-> !set.add(d)).distinct().forEach(System.out::println);
//		         Employee employee2 = list.stream()
//				.filter(k->k.getGender().equals("Female"))
//				.collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge))).get();
//				System.out.println(employee2);

	/*List<String> collect = list.stream().map(Employee::getName).collect(Collectors.toList());
	Collections.reverse(collect);
	System.out.println(collect);*/
		
		
//	 Stream<Employee> max = list.stream().filter(f-> f.getGender().equals("Female")).sorted(Comparator.comparing(Employee::getSalary).reversed());
//	  max.limit(1).forEach(System.out::println);	
		
		/*Integer orElseThrow = list.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElseThrow();
	    System.out.println(orElseThrow);
		*/
//	  Stream<Employee> filter = list.stream().filter(f-> !set.add(f.getAge())).distinct();
//	  filter.distinct().forEach(System.out::println);
		//System.out.println(5/2);
		
		//list.stream().sorted(Comparator.comparingInt(Employee::getAge).thenComparing(Comparator.comparingDouble(Employee::getSalary).reversed())).forEach(System.out::println);
		
		
//		list.stream()
//		.collect(Collectors.toMap(Employee::getGender, t -> t,(t, u) -> t.getSalary()>=u.getSalary() ? t : u))
//		.forEach((k,v)->System.out.println(k+" - "+v));

	//	list.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting())).entrySet().stream().filter(k->k.getValue()==1).forEach(k->System.out.println(k.getKey()));
		
//		Map<Integer, Map<String, Double>> collect2 = list.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.collectingAndThen(Collectors.toList(), k->{
//
//			Double maxx = k.stream().mapToDouble(k2->k2.getSalary()).max().getAsDouble();
//			Double min = k.stream().mapToDouble(k1->k1.getSalary()).min().getAsDouble();
//			Map<String, Double> map =  new HashMap<>();
//			map.put("max", maxx);
//			map.put("min", min);
//			return map;
//			
//		})));
//	 System.out.println(collect2);
		
		
	/*Map<Integer, Map<String, Double>> collect5 = list.stream()
	.collect(Collectors.groupingBy(Employee::getAge,
			Collectors.collectingAndThen(Collectors.toSet(), k ->
	{
	
		Double maxx = k.stream().mapToDouble(k2->k2.getSalary()).max().getAsDouble();
		Double min = k.stream().mapToDouble(k1->k1.getSalary()).min().getAsDouble();
		Map<String, Double> map =  new HashMap<>();
		map.put("max", maxx);
		map.put("min", min);
		return map;
		
	})));
	collect5.forEach((age,map)->
	{
		System.out.print("Age : "+age+" - ");
		System.out.println("Minimum : "+map.get("min")+" Maximum : "+map.get("max"));
	});*/
	
		
//		Map<String, Employee> collect2 = list.stream().collect(Collectors.toMap(Employee::getGender, t->t,(a,b)-> a.getSalary() > b.getSalary()?a:b));
//		collect2.forEach((k,v) ->System.out.println(k+" : "+v) );
		
		 //list.stream().filter(n -> n.getGender().equals("Male")).sorted((a,b)-> a.getName().length()-b.getName().length()).limit(1).forEach(System.out::println);
			/*Employee employee8 = list.stream().filter(k->k.getGender().equals("Male"))
					.min(Comparator.comparing(Employee::getName)).get();
					System.out.println(employee8);*/
		
//		Optional<Long> map = list.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getValue);
//		System.out.println(map);
		
		 
//				Optional<Employee> min = list.stream().filter(k->k.getAge() == list.stream().mapToInt(Employee::getAge).max().getAsInt()).min(Comparator.comparingDouble(Employee::getSalary));
//				System.out.println(min);
		
		
//		Optional<Employee> max = list.stream().sorted((x,y)-> x.getName().length()+y.getName().length()).max((a,b)->a.getName().length()-b.getName().length());
//		System.out.println(max);
		
//		list.stream()
//		.collect(Collectors.groupingBy(k->k.getName().substring(0, 2)))
//		.forEach((k,v)->System.out.println(k+" - "+v));
		
//		double average = list.stream().filter(f->f.getName().contains("A")&&f.getName().contains("B")).mapToDouble(Employee::getSalary).average().orElse(0.0);
//		System.out.println(average);
		
		//list.stream().collect(Collectors.groupingBy(k->k.getName().length())).forEach((k,v)->System.out.println(k+" "+v));
		
//		Double collect = list.stream().filter(k->k.getName().endsWith("na")).collect(Collectors.averagingDouble(Employee::getSalary));
//		System.out.println(collect);
		
		
		
//		Double collect7 = list.stream()
//				.filter(k->k.getName()
//						.endsWith("na")).collect(Collectors.averagingDouble(Employee::getSalary));
//				System.out.println(collect7);
		
//	   Optional<Employee> max = Optional.ofNullable(list.stream().filter(k->k.getSalary()<70000).max(Comparator.comparingInt(l->l.getName().length()))).get();
//       System.out.println(max);
       
       
//       Employee employee13 = list.stream().filter(k->k.getSalary()<70000)
//    			.max(Comparator.comparingInt(k->k.getName().length())).get();
//    			System.out.println(employee13);
		
	//	list.stream().collect(Collectors.groupingBy(k-> k.getName().subSequence(0, 2))).forEach((k,v)-> System.out.println(k+"  "+v));;
		
		
//		Employee employee12 = list.stream()
//				.min(Comparator.comparingInt(value -> value.getName().length()))
//				.get();
//		
//		System.out.println(employee12);
		
		
//		list.stream()
//		.collect(Collectors.groupingBy(t -> t.getName().charAt(0)))
//		.forEach((k,v)->System.out.println(k+" - "+v));
		

		//list.stream().map(Employee::getHiked).forEach(System.out::println);

		
		//list.stream().filter(Employee::getPrime).forEach(System.out::println);
		
//		String str="abcd";
//		long count = str.chars().distinct().count();
//		if(count==str.length())System.out.println("Unique");
//		else System.out.println("Duplicate");
		
		//list.stream().forEach(x->System.out.println(Thread.currentThread().getName()));
		
		
		
//		list.stream().collect(Collectors.groupingBy(Employee::getAge,
//				Collectors.mapping(Employee::getSalary, Collectors.toSet())))
//		.forEach((k,v)->System.out.println(k+" - "+v));
		
		
//		Map<Integer,Map<String,Double>> collect5 = list.stream()
//				.collect(Collectors.groupingBy(Employee::getAge,
//						Collectors.collectingAndThen(Collectors.toList(), k ->
//				{
//					Double maxx = k.stream().mapToDouble(k2->k2.getSalary()).max().getAsDouble();
//					Double min = k.stream().mapToDouble(k1->k1.getSalary()).min().getAsDouble();
//					Map<String, Double> map =  new HashMap<>();
//					map.put("max", maxx);
//					map.put("min", min);
//					return map;
//					
//				})));
//				collect5.forEach((age,map)->
//				{
//					System.out.print("Age : "+age+" - ");
//					System.out.println("Minimum : "+map.get("min")+" Maximum : "+map.get("max"));
//				});
		
		
//		list.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);
		
		
		//list.stream().mapToInt(Employee::getAge).max().orElse(0);		
		
//		list.stream().collect(Collectors.groupingBy((t)->{
//			int age = ((Employee) t).getAge();
//			if(age > 20 && age < 35)
//			{
//				return age;
//			}
//			return age;
//			})).forEach((k,v)->System.out.println(k+"  "+v));
		 	
		
//		list.stream()
//		.collect(Collectors.groupingBy(Employee::getGender,
//				Collectors.averagingDouble(Employee::getSalary)))
//		.forEach((key,value)->System.out.println(key+" - "+value));

		
//		list.stream()
//		.collect(Collectors.groupingBy(Employee::getAge,
//				Collectors.mapping(Employee::getSalary, Collectors.toSet())))
//		.forEach((k,v)->System.out.println(k+" - "+v));
		
//	Map<Integer,Map<String,Double>> collect =	list.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.collectingAndThen(Collectors.toList(),m->{
//		Double max = m.stream().mapToDouble(k1->k1.getSalary()).max().getAsDouble();
//		Double min = m.stream().mapToDouble(k1->k1.getSalary()).min().getAsDouble();
//		Map<String, Double> map =  new HashMap<>();
//		map.put("max", max);
//		map.put("min", min);
//		return map;
//		})));
//           
//	     collect.forEach((k,v) ->{
//	    	 System.out.print("Age is : "+k);
//	    	 System.out.println("max sal : "+v.get("max")+", Min sal : "+v.get("min")+"");
//	     });
	     
	     
	    
       //list.stream().collect(Collectors.toMap(Employee::getGender, t->t,(a,b)->a.getSalary() >= b.getSalary()?a:b)).forEach((k,v)->System.out.println(k+"-"+v));
//		Integer integer = list.stream()
//				.collect(Collectors.groupingBy(Employee::getAge , Collectors.counting()))
//				.entrySet()
//				.stream()
//				.max(Map.Entry.comparingByValue())
//				.map(Map.Entry::getKey)
//				.get();
//				System.out.println(integer);
				
		
//		list.stream().filter(k->{
//			String mainString = k.getName().toLowerCase();
//			StringBuffer sb = new StringBuffer(mainString);
//		 return mainString.contentEquals(sb.reverse());
//		}).forEach(System.out::println);

		
//		list.stream()
//		.filter(k->
//		{
//			String mainString = k.getName().toLowerCase();
//			StringBuffer sr = new StringBuffer(mainString);
//			return mainString.contentEquals(sr.reverse());
//		}).forEach(System.out::println);
		
      //list.stream().sorted((a,b)->-(int)(a.getSalary()-b.getSalary())).limit(5).forEach(System.out::println);
      //  list.stream().filter(k-> set.add(k.getAge())).distinct().forEach(System.out::println);
		
//	List<Integer> num1 = Arrays.asList(8,1,2,3,4);
//	
//	List<Integer> num2 = Arrays.asList(8,2,3,5,6);
//	
//	List<Integer> collect = Stream.concat(num1.stream(), num2.stream()).collect(Collectors.toList());
//	collect.stream().filter(k->!set.add(k.intValue())).distinct().forEach(System.out::println);

		//list.stream().collect(Collectors.groupingBy(Employee::getSalary)).entrySet().stream().filter(k->k.getKey()>1).forEach(System.out::println);
		
		//list.stream().collect(Collectors.groupingBy(Employee::getName)).entrySet().stream().max((k,v)->k.getKey().compareTo(v.getValue()))

//		double asDouble = list.stream().filter(k->k.getName().startsWith("A")&&k.getName().equals("E")).mapToDouble(Employee::getSalary).average().orElse(0);
//		System.out.println(asDouble);

		//list.stream().collect(Collectors.groupingBy(k->k.getName().length())).forEach((k,v)-> System.out.println(k+" "+v));
		
		//  list.stream().sorted((k,v)->+k.getName().length()-v.getName().length()).forEach(System.out::println);
		
		// list.stream().filter(k->k.getName().endsWith("na")).mapToDouble((k)->k.getSalary()).average().orElse(0);
		
//		Optional<Employee> max = list.stream().filter(k-> k.getSalary() < 70000).max(Comparator.comparingInt(k->k.getName().length()));
//	     System.out.println(max);
//		Optional<Employee> collect = list.stream().filter(k->k.getSalary() < 70000).collect(Collectors.maxBy(Comparator.comparing(Employee::getName)));
//		System.out.println(collect);
		
		
		//list.stream().collect(Collectors.groupingBy(k->k.getName().subSequence(0, 2))).entrySet().forEach(System.out::println);
	
//		Double collect = list.stream().filter(k->k.getName().startsWith("E")).collect(Collectors.averagingDouble(Employee::getSalary));
//	     System.out.println(collect);
//	     
//	     Optional<Employee> collect2 = list.stream().collect(Collectors.minBy(Comparator.comparingInt(k->k.getName().length())));
//	     System.out.println(collect2);
	     
	      list.stream().collect(Collectors.groupingBy(k->k.getName().charAt(0))).forEach((k,v)->System.out.println(k+"       :     "+v));
	}
	
	
}




	
























