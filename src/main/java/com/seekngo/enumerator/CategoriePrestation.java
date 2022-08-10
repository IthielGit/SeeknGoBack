package com.seekngo.enumerator;

public enum CategoriePrestation {
	BIEN_ETRE("Bien être"), SPORT_ET_LOISIRS("Sport et loisirs"), FUN_TIME("Fun Time"), BALADES("Balades"), VIRTUEL("Virtuel"), ATELIERS("Ateliers");
	
	private String category;

	CategoriePrestation(String category){
        this.category = category;
    }

    public String getCategory(){
        return this.category;
    }
}
