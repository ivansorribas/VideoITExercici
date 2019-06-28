package VideosIT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	static List<Videos> videoList = new ArrayList<>();
	static List<String> genericTagList = new ArrayList<>(Arrays.asList("TipusA", "TipusB", "TipusC", "TipusD"));
	
	public static void main(String[] args) throws Exception {
		
		
		User user1 = new User("Xavi", "Vila", "111BB11111");
		User user2 = new User("Lidia", "Román", "22222222");
		User user3 = new User("Joan", "Sanchez", "3333333333");
		User user4 = new User("Nuria", "Marin", "44444444444444");
		User user5 = new User("Felix", "Mateo", "5555555555");
		User user6 = new User("Ivan", "Sorribas", "66666666AA");
		
		
		System.out.println(user1.getName() + " " + user1.getSurame() + ". ID:  " + user1.getUserId() + "\nData registre: " + user1.getRegistrationDate());
		System.out.println(user2.getName() + " " + user2.getSurame() + ". ID:  " + user2.getUserId() + "\nData registre: " + user2.getRegistrationDate());	
		System.out.println(user3.getName() + " " + user3.getSurame() + ". ID:  " + user3.getUserId() + "\nData registre: " + user3.getRegistrationDate());
		System.out.println(user4.getName() + " " + user4.getSurame() + ". ID:  " + user4.getUserId() + "\nData registre: " + user4.getRegistrationDate());
		System.out.println(user5.getName() + " " + user5.getSurame() + ". ID:  " + user5.getUserId() + "\nData registre: " + user5.getRegistrationDate());
		System.out.println(user6.getName() + " " + user6.getSurame() + ". ID:  " + user6.getUserId() + "\nData registre: " + user6.getRegistrationDate());
		
		
		user1.createVideo("Vídeo 1.1", genericTagList, videoList);
		
		user2.createVideo("Vídeo 1.2", genericTagList, videoList);
		user2.createVideo("Vídeo 1.3", genericTagList, videoList);
		user2.createVideo("Vídeo 1.4", genericTagList, videoList);
		
		user3.createVideo("Vídeo 1.5", genericTagList, videoList);
		
		user4.createVideo("Vídeo 1.6", genericTagList, videoList);
		user4.createVideo("Vídeo 1.7", genericTagList, videoList);
		
		
		user5.createVideo("Vídeo 1.8", genericTagList, videoList);
		
		
		user6.createVideo("Vídeo 1.9", genericTagList, videoList);
		user6.createVideo("Vídeo 1.10", genericTagList, videoList);
		
		
		
		System.out.println(user1.printVideos(videoList));
		System.out.println(user2.printVideos(videoList));
		System.out.println(user3.printVideos(videoList));
		System.out.println(user4.printVideos(videoList));
		System.out.println(user5.printVideos(videoList));
		System.out.println(user6.printVideos(videoList));

	}

}