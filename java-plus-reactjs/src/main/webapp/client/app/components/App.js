import React from "react";
import { connect } from "react-redux";
import { bindActionCreators } from "redux";
// https://github.com/amsul/react-translated
import { Provider } from "react-translated";

import { updatei18n } from "../actions/i18n";
import { changeLanguage } from "../actions/language";

// import Aux from "./Aux";
import Header from "./header";
import Routes from "./Routes";

import "../scss/style.scss";


class App extends React.PureComponent {

  componentWillMount() {
    this.props.onUpdatei18n(this.props.language);
  }

  render() {
    return (
      <Provider language={this.props.language} translation={this.props.i18n}>
        <Header />
        <Routes />
        <select
          onChange={this.props.onChangeLanguage}
          style={{ marginTop: 20, padding: 10, WebkitAppearance: "none" }}
          value={this.props.language}
        >
          <option value="en">English</option>
          <option value="ar">Arabic</option>
        </select>
      </Provider>
    );
  }
}

const mapStateToProps = ({
  language: { current },
  i18n,
  routing: { location }
}) => ({
  language: current,
  i18n,
  location
});

const mapDispatchToProps = dispatch =>
  bindActionCreators(
    {
      onChangeLanguage: ({ target: { value } }) => changeLanguage(value),
      onUpdatei18n: language => updatei18n(language)
    },
    dispatch
  );

export default connect(mapStateToProps, mapDispatchToProps)(App);