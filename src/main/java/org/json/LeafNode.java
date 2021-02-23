package org.json;

/*
SWE 262P Milestone4
 */
public class LeafNode {

    String key;
    String value;

    public LeafNode(String key, String value){
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "LeafNode{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

}
