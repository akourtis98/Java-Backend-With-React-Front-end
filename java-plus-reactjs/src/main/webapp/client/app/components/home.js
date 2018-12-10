import React, {Component} from 'react';
import {getSuggestedUsers} from "../../actions/otherActions";
import {connect} from 'react-redux';

class About extends Component {
    constructor(props) {
        super(props);
    }

    render() {
        <div>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolore, veritatis,
                tempora, necessitatibus inventore nisi quam quia repellat ut tempore laborum
                possimus eum dicta id animi corrupti debitis ipsum officiis rerum.</p>
            <p>In volutpat eu nisi vel sodales. Etiam sagittis magna id turpis elementum
                consequat. Nam ut aliquam metus, ut dictum quam. Fusce arcu libero, pharetra
                quis nibh a, dictum tempus ipsum. Ut scelerisque ipsum in commodo vulputate.
                Ut sollicitudin dictum iaculis. Integer lacinia dui non porta placerat.
                Duis vehicula vestibulum arcu, eu porta odio. Proin at mauris blandit,
                vulputate mi ut, maximus diam.</p>
            <p>Mauris iaculis mi ac elit ultricies congue. Sed vitae ante id sem gravida
                sagittis. Morbi ac massa lectus. Vivamus ac ullamcorper enim, vitae tempus
                libero. Vestibulum convallis tortor sit amet leo pulvinar pharetra. Pellentesque
                quam nunc, pulvinar ut gravida eu, sagittis non quam. Suspendisse suscipit
                ante et sapien hendrerit, vitae congue nisi dapibus.</p>
        </div>
    }
}