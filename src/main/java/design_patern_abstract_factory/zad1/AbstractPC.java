package design_patern_abstract_factory.zad1;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class AbstractPC {
    private String name;
    private ComputerBrand brand;
    private int cpuPower;
    private double gpuPower;
    private boolean isOverclocked;
}
