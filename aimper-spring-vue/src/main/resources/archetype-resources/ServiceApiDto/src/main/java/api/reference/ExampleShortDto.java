package ${package}.api.reference;

import ${package}.general.dto.BaseUpdatableDto;

public class ExampleShortDto extends BaseUpdatableDto {

    private String name;
    private String code;
    private Integer weight;

    public ExampleShortDto() {
    }

    public ExampleShortDto(Long id) {
        super(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}