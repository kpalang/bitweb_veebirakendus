package kaur;

import kaur.db.Employee;
import kaur.db.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping(path="/lisa")
    public @ResponseBody String addEmployee(@RequestParam String nimi, @RequestParam String ulemus) {

        Employee n = new Employee();
        n.setId(0);
        n.setName(nimi);
        n.addSuper(ulemus);
        employeeRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/ulemus")
    public @ResponseBody String addSuper(@RequestParam int id, @RequestParam String nimi) {

        long l = id;
        Employee n = employeeRepository.findOne(l);
        n.addSuper(nimi);
        employeeRepository.save(n);
        return "Updated";
    }

    @GetMapping(path="/")
    public @ResponseBody Iterable<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

}
