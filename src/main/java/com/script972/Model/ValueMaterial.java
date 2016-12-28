package com.script972.Model;

import javafx.scene.control.TableView;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

/**
 * Created by script972 on 28.12.2016.
 */
public class ValueMaterial {
    int id;
    String name;
    String count;
    String deciminal;
    String category;
    String serial_number;
    String id_survice;
    String create_by;


    public ValueMaterial(int id, String name, String count, String deciminal, String category, String serial_number) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.deciminal = deciminal;
        this.category = category;
        this.serial_number = serial_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getDeciminal() {
        return deciminal;
    }

    public void setDeciminal(String deciminal) {
        this.deciminal = deciminal;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public String getId_survice() {
        return id_survice;
    }

    public void setId_survice(String id_survice) {
        this.id_survice = id_survice;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }
}
