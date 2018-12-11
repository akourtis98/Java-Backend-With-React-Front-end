import React from "react";
import { push } from "react-router-redux";
import { bindActionCreators } from "redux";
import { connect } from "react-redux";

import {
  increment,
  incrementAsync,
  decrement,
  decrementAsync
} from "../../actions/counter";
import { hello } from "../../api/hello";

import Title from "./Title";
import Counter from "./Counter";
import Notes from "./Notes";
import Footer from "./Footer";

import "./style.scss";

const Home = props => (
  <div className="home g-flex-column g-flex-item-stretch">
    <Title />
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
    <Counter {...props} />
    <Notes />
    <Footer {...props} />
  </div>
);

const mapStateToProps = ({ counter }) => ({ ...counter });

const mapDispatchToProps = dispatch =>
  bindActionCreators(
    {
      increment,
      incrementAsync,
      decrement,
      decrementAsync,
      hello,
      changePage: () => push("/about")
    },
    dispatch
  );

// Or can be as below if u want to dispatch action
// const mapDispatchToProps = dispatch => ({
//   changePage: () => dispatch(push('/about-us'))
// })

export default connect(mapStateToProps, mapDispatchToProps)(Home);

/* To push to history:
import { push } from "react-router-redux";
push("/about")
-- OR --
this.props.histtory.push("/about")
*/
