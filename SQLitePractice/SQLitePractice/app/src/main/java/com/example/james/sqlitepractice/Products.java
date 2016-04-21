package com.example.james.sqlitepractice;

/**
 * Created by james_000 on 4/19/2016.
 */
public class Products {

    private int _id;
    private String _productName;

    //empty constructor
    public Products(){

    }

    //constructor 2
    public Products(String productName){
        this._productName = productName;
    }

    //getters and setters
    public void set_id(int _id) {
        this._id = _id;
    }

    public int get_id() {
        return _id;
    }

    public String get_productName() {
        return _productName;
    }

    public void set_productName(String _productName) {
        this._productName = _productName;
    }
}
