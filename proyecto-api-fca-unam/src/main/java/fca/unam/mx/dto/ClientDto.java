package fca.unam.mx.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
    private Long id;
    private String name;
    private String last_name_1;
    private String last_name_2;
    private String RFC;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ColumnName("apellido paterno")
    public String getLastName1() {
        return last_name_1;
    }

    public void setLastName2(String last_name_1) {
        this.last_name_1 = last_name_1;
    }

    @ColumnName("apellido materno")
    public String getLastName2() {
        return this.last_name_2;
    }

    public void setLastName2(String last_name_2) {
        this.last_name_2 = last_name_2;
    }

    @ColumnName("RFC")
    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    private String RFC;

}
