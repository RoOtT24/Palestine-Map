//package application ;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
///*public class Test {
//	static LinkedList<City> city = new LinkedList<City>();
//	static Queue<City> path = new Queue<>();
//	// List<City> order=new ArrayList<City>();//list of visited
//	// List<City> parent=new ArrayList<City>();//list of parent of each node visited
//	static Queue<City> visited = new Queue<>();
//
//	public static void main(String[] args) throws Exception {
//		// menu
//
//		System.out.println(" what algorithm do you want ? :");
//		Scanner input1 = new Scanner(System.in);
//		int x = input1.nextInt();
//		if (x == 1)
//			readFromFile(input1);
//		BFS();
//
//	}
//
//	private static void readFromFile(Scanner sc) throws Exception {
//		try {
//			File f = new File("distance.txt");
//			String[] cities = null;
//			Scanner input = new Scanner(f);
//			for (int i = 0; input.hasNext(); ++i) {
//				if (i == 0) {
//					cities = input.nextLine().trim().split(" ");
//
//					// System.out.println(Arrays.toString(cities));
//
//				} else {
//					String[] splitter = input.nextLine().trim().split(" ");
//					City c = new City(splitter[0]);
//					for (int j = 0; j < cities.length && j < splitter.length - 1; ++j) {
//						String[] distances = splitter[j + 1].trim().split(",");
//						c.getDistenations()
//								.insertion(new Dest(cities[j], Integer.parseInt(distances[0]),
//										Integer.parseInt(distances[1].trim()), Integer.parseInt(distances[2].trim()),
//										splitter[0]));
//					}
//					city.insertion(c);
//
//				}
//
//			}
//			City c = new City("Ramallah");
//			Dest d = new Dest("Nablus");
//			System.out.println(city.find(c).getData().getDistenations().find(d).toString());
//
//			// System.out.println(city.toString());
//			input.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//	public static void BFS() {
//	
//
//		City start = new City("Ramallah");
//		City temp1 = null;
//		int currlength = 0;
//		city.insertion(start);
//		
//		ArrayList<String> results = new ArrayList<>();
//
//		Dest goal = new Dest("Nablus");
//		while (!p.getData().getName().equals(goal.getName())) {
//			path.enqueue(p.getData());
//			currlength = path.length() - 1;
//			/*
//			 * driving_cost += path.getFront().getDrivingCost(); walking_cost +=
//			 * path.getFront().getWalkingCost();
//			 */	Node<Dest> temp = path.getFront().getDistenations().find(goal);
//			if (temp != null && temp.getData().getDrivingCost() != -1 && temp.getData().getWalkingCost() != -1) {
//				City s = new City(goal.getName());
//				s.parent = temp1 ;
//				path.enqueue(city.find(s).getData());
//			}
//			else {results = path.getFront().findDistenations() ;
//				for(int i = 0 ; i<results.size() ; ++i) {
//					Node<City> temp2 = city.find(new City(results.get(i))) ;
//					temp2.getData().parent = temp1 ;
//				}
//			}
//			temp1 = path.dequeue();
//*/
//}}}}
//	
//
