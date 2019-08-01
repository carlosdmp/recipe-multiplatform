import UIKit
import app

class ViewController: UIViewController, RecipeView {
   
    func showState(state: RecipeState) {
        label.text = state.s
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        let presenter = NativeRecipePresenter(view: self)
        do{
        try presenter.start()
        } catch {
             print("mis huevos")
        }
       
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    
    @IBOutlet weak var label: UILabel!
}
