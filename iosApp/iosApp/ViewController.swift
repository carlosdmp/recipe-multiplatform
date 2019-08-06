import UIKit
import app

class ViewController: UIViewController, RecipeView{
    
    var currentState : RecipeState? = nil

    func showState(state: RecipeState) {
        
    }
    
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        if(segue.identifier == "recipeSegue"){
            let secondViewController = segue.destination as? RecipeTableViewController
            secondViewController?.searchQuery = searchField.text
        }
    }

    @IBOutlet weak var searchField: UITextField!
    
    override func viewDidLoad() {
        super.viewDidLoad()
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    
}
