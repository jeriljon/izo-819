package vi.streams;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.awt.*;

@Data
@RequiredArgsConstructor
public class Brick {

    private Color color;
    private int weight;

    public Brick(Color color, int i) {
    }
}
