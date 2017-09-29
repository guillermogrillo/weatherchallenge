/**
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.2.3
 *
 * Do not edit the class manually.
 *
 */

(function(factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/ModelAndView', 'model/NewBoardDto', 'model/Place', 'model/UserLoginDto', 'model/View', 'api/BasicerrorcontrollerApi', 'api/WeathercontrollerApi'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('./ApiClient'), require('./model/ModelAndView'), require('./model/NewBoardDto'), require('./model/Place'), require('./model/UserLoginDto'), require('./model/View'), require('./api/BasicerrorcontrollerApi'), require('./api/WeathercontrollerApi'));
  }
}(function(ApiClient, ModelAndView, NewBoardDto, Place, UserLoginDto, View, BasicerrorcontrollerApi, WeathercontrollerApi) {
  'use strict';

  /**
   * Api_Documentation.<br>
   * The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
   * <p>
   * An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
   * <pre>
   * var ApiDocumentation = require('index'); // See note below*.
   * var xxxSvc = new ApiDocumentation.XxxApi(); // Allocate the API class we're going to use.
   * var yyyModel = new ApiDocumentation.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
   * and put the application logic within the callback function.</em>
   * </p>
   * <p>
   * A non-AMD browser application (discouraged) might do something like this:
   * <pre>
   * var xxxSvc = new ApiDocumentation.XxxApi(); // Allocate the API class we're going to use.
   * var yyy = new ApiDocumentation.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * </p>
   * @module index
   * @version 1.0
   */
  var exports = {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient: ApiClient,
    /**
     * The ModelAndView model constructor.
     * @property {module:model/ModelAndView}
     */
    ModelAndView: ModelAndView,
    /**
     * The NewBoardDto model constructor.
     * @property {module:model/NewBoardDto}
     */
    NewBoardDto: NewBoardDto,
    /**
     * The Place model constructor.
     * @property {module:model/Place}
     */
    Place: Place,
    /**
     * The UserLoginDto model constructor.
     * @property {module:model/UserLoginDto}
     */
    UserLoginDto: UserLoginDto,
    /**
     * The View model constructor.
     * @property {module:model/View}
     */
    View: View,
    /**
     * The BasicerrorcontrollerApi service constructor.
     * @property {module:api/BasicerrorcontrollerApi}
     */
    BasicerrorcontrollerApi: BasicerrorcontrollerApi,
    /**
     * The WeathercontrollerApi service constructor.
     * @property {module:api/WeathercontrollerApi}
     */
    WeathercontrollerApi: WeathercontrollerApi
  };

  return exports;
}));