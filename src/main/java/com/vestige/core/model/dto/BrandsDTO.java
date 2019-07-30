package com.vestige.core.model.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Brands entity.
 */
public class BrandsDTO implements Serializable {

    private String id;

    private Integer brandId;

    private String images;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BrandsDTO brandsDTO = (BrandsDTO) o;
        if (brandsDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), brandsDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "BrandsDTO{" +
            "id=" + getId() +
            ", brandId=" + getBrandId() +
            ", images='" + getImages() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }
}
