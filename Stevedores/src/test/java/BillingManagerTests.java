import com.Stevedores.Stevedores.Controller.BillingManager;
import com.Stevedores.Stevedores.Controller.ServiceManager;
import com.Stevedores.Stevedores.Controller.WasteManager;
import com.Stevedores.Stevedores.Controller.WaterManager;
import com.Stevedores.Stevedores.Model.Bill;
import com.Stevedores.Stevedores.Model.PortServiceOrder;
import com.Stevedores.Stevedores.Model.WaterStore;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BillingManagerTests {

    @Test
    public void BillingTest(){
        BillingManager b = new BillingManager();
        Bill actual = b.CreateBill(new PortServiceOrder());
        Bill expected = new Bill(66L, 100, "bigship", LocalDate.now() , 80.0);
        assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }

    @Test
    public void CalculateTest(){
        BillingManager b = new BillingManager();
        Bill actual = b.CreateBill(new PortServiceOrder());
        Double expected = 80.0;

        assertThat(actual).isEqualTo(expected);
    }


}
