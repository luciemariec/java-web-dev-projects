package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;
    private String restaurantName;
    private String restaurantDescription;

    public Menu(ArrayList<MenuItem> menuItems, String restaurantName, String restaurantDescription) {
        this.menuItems = menuItems;
        this.restaurantName = restaurantName;
        this.restaurantDescription = restaurantDescription;
    }

    public void addMenuItem(MenuItem newItem) {
        menuItems.add(newItem);
    }

    public void removeMenuItem(MenuItem menuItem) {
        menuItems.remove(menuItem);
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantDescription() {
        return restaurantDescription;
    }

    public void setRestaurantDescription(String restaurantDescription) {
        this.restaurantDescription = restaurantDescription;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
