package contract;

import java.io.IOException;

public interface IOrderPerformer {
    void orderPerform(ControllerOrder  UserOrder) throws IOException;
}
