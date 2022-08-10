package guru.springframework.domain;

import javax.persistence.*;
import java.util.*;

/**
 * Created by jt on 6/13/17.
 */
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    public UnitOfMeasure()
    {
    }

    public Long getId()
    {
        return this.id;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public boolean equals(final Object o)
    {
        if (o == this) return true;
        if (!(o instanceof UnitOfMeasure)) return false;
        final UnitOfMeasure other = (UnitOfMeasure) o;
        if (!other.canEqual(this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (!Objects.equals(this$id, other$id)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        return Objects.equals(this$description, other$description);
    }

    protected boolean canEqual(final Object other)
    {
        return other instanceof UnitOfMeasure;
    }

    public int hashCode()
    {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        return result;
    }

    public String toString()
    {
        return this.getDescription();
    }
}
