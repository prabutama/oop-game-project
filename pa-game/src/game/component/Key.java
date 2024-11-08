/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.component;

/**
 *
 * @author prabutama
 */
public class Key {

    public boolean isKey_righ() {
        return key_righ;
    }

    public void setKey_righ(boolean key_righ) {
        this.key_righ = key_righ;
    }

    public boolean isKey_left() {
        return key_left;
    }

    public void setKey_left(boolean key_left) {
        this.key_left = key_left;
    }

    public boolean isKey_space() {
        return key_space;
    }

    public void setKey_space(boolean key_space) {
        this.key_space = key_space;
    }

    public boolean isKey_k() {
        return key_k;
    }

    public void setKey_k(boolean key_k) {
        this.key_k = key_k;
    }

    public boolean isKey_j() {
        return key_j;
    }

    public void setKey_j(boolean key_j) {
        this.key_j = key_j;
    }
    
    private boolean key_righ;
    private boolean key_left;
    private boolean key_space;
    private boolean key_k;
    private boolean key_j;
}
