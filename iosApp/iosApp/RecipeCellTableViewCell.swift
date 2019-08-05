//
//  RecipeCellTableViewCell.swift
//  iosApp
//
//  Created by Miguel Platero, C. on 05/08/2019.
//

import UIKit

class RecipeCellTableViewCell: UITableViewCell {

    //MARK: Properties
    
    override func awakeFromNib() {
        super.awakeFromNib()
        // Initialization code
    }

    override func setSelected(_ selected: Bool, animated: Bool) {
        super.setSelected(selected, animated: animated)

        // Configure the view for the selected state
    }
    @IBOutlet weak var label: UILabel!
    @IBOutlet weak var ingredients: UILabel!
}
