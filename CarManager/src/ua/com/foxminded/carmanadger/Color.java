package ua.com.foxminded.carmanadger;

public enum Color {
	BLACK ("Black"),

	ORANGE ("Orange"),

	WHITE ("White"),

	YELLOW ("Yellow"),

	BLUE ("Blue"),

	GREEN ("Green");
	
	private String nameColor;
	
	private Color(String nameColor) {
	this.nameColor = nameColor;//щоб в enum вказти строкову змінну то треба створити обєкт private String nameColor , та створити приватний конструктор
	}
	
	public String getColor() { //  створюємо метод для того щоб вивести значення енама, а не сам енам
		return nameColor ;
	}
	
}
