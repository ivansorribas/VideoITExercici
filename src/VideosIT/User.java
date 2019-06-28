package VideosIT;

import java.util.Date;
import java.util.List;

public class User {
	private static int userCount;
	private int userId;
	private String name;
	private String surname;
	private String password;
	private static final int minLength = 8;
	private static final int maxLength = 16;
	private Date registrationDate;
	
	public User(String name, String surname, String password) throws Exception{
		if(name.equals("")) throw new Exception("El nom de l'usuari ha de tenir com a m�nim un car�cter");
		if(surname.equals("")) throw new Exception("El cognom de l'usuari ha de tenir com a m�nim un car�cter");
		if((password.length() < minLength) || (password.length() > maxLength)) throw new Exception
		("La contrassenya ha de tenir un m�nim de " + minLength + " car�cters i un m�xim de " + maxLength + " car�cters.");
		userCount++;
		userId = userCount;
		this.name = name;
		this.surname = surname;
		this.password = password;
		registrationDate = new Date();
	}
	
	public String getName() {
		return name;
	}
	public String getSurame() {
		return surname;
	}
	public int getUserId() {
		return userId;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	
	public String changePassword(String password, String newPassword) throws Exception {
		if(this.password.equals(password)) {
			if((newPassword.length() < minLength) || (newPassword.length() > maxLength)) throw new Exception
				("La nova contrassenya ha de tenir un m�nim de " + minLength + " car�cters i un m�xim de " + maxLength + " car�cters.");
			this.password = newPassword;
			return "La contrassenya s'ha canviat correctament.";
		}else {
			return "No s'ha pogut canviar la contrassenya.";
		}
	}
	
	public void createVideo(String title, List<String> tagList, List<Videos> videoList) throws Exception{
		videoList.add(new Videos(userId, title, tagList));
	}
	public String printVideos(List<Videos> videoList){
		String result = "La llista de v�deos de l'usuari/a " + name + " " + surname + " �s:\n";
		for(Videos v : videoList) {			
			if(v.getCreator() == this.userId) {
				result = result + "- " + v.getTitle() + "\n";
			}
		}
		return result;
	}

}