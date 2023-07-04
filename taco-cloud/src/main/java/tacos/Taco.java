package tacos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;
@Data
public class Taco {
    @NotNull
    @Size(min=5,message = "Most be at least 5 characters long")
    private String name;
    @NotNull
    @Size(min=1, message = "Must choose at least 1 ingredient")
    private List<Ingredient> ingredients;
}
