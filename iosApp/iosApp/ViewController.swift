import UIKit
import app

class ViewController: UIViewController, RecipeView {
   
    func showState(state: RecipeState) {
        label.text = state.recipes.title
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        let presenter = RecipePresenter(view: self)
        presenter.start()
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    
    @IBOutlet weak var label: UILabel!
}
