import UIKit
import app

class ViewController: UIViewController, RecipeView{
    
    var currentState : RecipeState? = nil

    func showState(state: RecipeState) {
        
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        let presenter = RecipePresenter(view: self)
        presenter.start()
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    
}
