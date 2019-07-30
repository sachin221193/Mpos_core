package com.vestige.core.model.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the SubstituteProducts entity.
 */
public class SubstituteProductsDTO implements Serializable {

    private String id;

    private Long substituteProductsId;

    private String name;

    private String url;

    private String displayImage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getSubstituteProductsId() {
        return substituteProductsId;
    }

    public void setSubstituteProductsId(Long substituteProductsId) {
        this.substituteProductsId = substituteProductsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDisplayImage() {
        return displayImage;
    }

    public void setDisplayImage(String displayImage) {
        this.displayImage = displayImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SubstituteProductsDTO substituteProductsDTO = (SubstituteProductsDTO) o;
        if (substituteProductsDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), substituteProductsDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "SubstituteProductsDTO{" +
            "id=" + getId() +
            ", substituteProductsId=" + getSubstituteProductsId() +
            ", name='" + getName() + "'" +
            ", url='" + getUrl() + "'" +
            ", displayImage='" + getDisplayImage() + "'" +
            "}";
    }
}
