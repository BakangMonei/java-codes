package admin;

import product.Product;
import product.ProductService;
import user.User;
import user.UserService;


@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ProductService productService;
    @Autowired
    private UserService userService;

    public String adminPage(HttpSession session){
        User user = (User) session.getAttribute("user");
        if(user == null || !user.isAdmin()){
            return "redirect:/";
        }
        return "adminpage";
    }

    public String addProductGet(Model model, HttpSession session){
        User user = (User) session.getAttribute("user");
        if(user == null || !user.isAdmin()){
            return "redirect:/";
        }
        model.addAttribute("product", new Product());
        return "addproduct";
    }

    @PostMapping("/product/add")
    public String addProductPost(@ModelAttribute("product") Product product, BindingResult result, HttpSession session){
        if (result.hasErrors()) {
            return "addproduct";
        }
        User user = (User) session.getAttribute("user");
        if(user == null || !user.isAdmin()){
            return "redirect:/";
        }
        productService.save(product);
        return "redirect:/";
    }
}