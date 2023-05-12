package ee.daniel.kt_2;


//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.GetMapping;
//
//
//
//@Controller
//@RequestMapping("/stores")
//public class StoreController {
//    private final StoreRepository storeRepository;
//    public StoreController(StoreRepository storeRepository) {
//        this.storeRepository = storeRepository;
//    }
//
//    @PostMapping("/createStore/{storeName}/{openTime}/{closeTime}/{visitorCount}")
//    public String createStore(
//            @PathVariable("storeName") String storeName,
//            @PathVariable("openTime") int openTime,
//            @PathVariable("closeTime") int closeTime,
//            @PathVariable("visitorCount") int visitorCount
//    ) {
//        String formattedOpenTime = String.format("%02d:00", openTime);
//        String formattedCloseTime = String.format("%02d:00", closeTime);
//
//        Store newStore = new Store(storeName, formattedOpenTime, formattedCloseTime, visitorCount);
//        storeRepository.save(newStore);
//
//        return "Store created and added to the database: " + newStore.toString();
//    }
//}

//    @GetMapping("/add")
//    public String showAddStoreForm(Model model) {
//        model.addAttribute("store", new Store());
//        return "addStore";
//    }
//
//    @PostMapping("/add")
//    public String addStore(@ModelAttribute Store store) {
//        storeRepository.save(store);
//        return "redirect:/stores";
//    }
//
//    @GetMapping("/stores")
//    public ModelAndView getAllStores() {
//        ModelAndView modelAndView = new ModelAndView("stores");
//        modelAndView.addObject("stores", storeRepository.findAll());
//        return modelAndView;
//    }
//
//    //localhost:8080/status/Store1?time=09:00
//    @GetMapping("/status/{storeName}")
//    public String getStoreStatus(@PathVariable String storeName, @RequestParam String time, Model model) {
//        boolean isOpen = isStoreOpenAtTime(storeName, time);
//
//        if (isOpen) {
//            model.addAttribute("status", "The store " + storeName + " is open at " + time);
//        } else {
//            model.addAttribute("status", "The store " + storeName + " is closed at " + time);
//        }
//
//        return "storeStatus";
//    }
//
//    @PostMapping("/incrementVisits/{storeName}")
//    public String incrementVisits(@RequestParam String storeName) {
//        incrementNumberOfVisitors(storeName);
//        return "redirect:/stores";
//    }
//
//    private boolean isStoreOpenAtTime(String storeName, String time) {
//        Store store = storeRepository.findByName(storeName);
//
//        // Compare the time with the store's openingTime and closingTime
//        // Implement your comparison logic here
//
//        // Return true if the store is open at the given time, false otherwise
//        return false;
//    }
//
//    private void incrementNumberOfVisitors(String storeName) {
//        Store store = storeRepository.findByName(storeName);
//        store.setNumberOfVisitors(store.getNumberOfVisitors() + 1);
//        storeRepository.save(store);
//    }
//}
