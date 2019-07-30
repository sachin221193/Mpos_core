package com.vestige.core.model.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the ReletedProducts entity.
 */
public class ReletedProductsDTO implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

    private Long relProductsId;

    private String name;

    private String url;

    private String displayImage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getRelProductsId() {
        return relProductsId;
    }

    public void setRelProductsId(Long relProductsId) {
        this.relProductsId = relProductsId;
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

        ReletedProductsDTO reletedProductsDTO = (ReletedProductsDTO) o;
        if (reletedProductsDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), reletedProductsDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ReletedProductsDTO{" +
            "id=" + getId() +
            ", relProductsId=" + getRelProductsId() +
            ", name='" + getName() + "'" +
            ", url='" + getUrl() + "'" +
            ", displayImage='" + getDisplayImage() + "'" +
            "}";
    }
}
