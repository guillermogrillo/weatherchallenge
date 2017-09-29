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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/NewBoardDto', 'model/UserLoginDto'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/NewBoardDto'), require('../model/UserLoginDto'));
  } else {
    // Browser globals (root is window)
    if (!root.ApiDocumentation) {
      root.ApiDocumentation = {};
    }
    root.ApiDocumentation.WeathercontrollerApi = factory(root.ApiDocumentation.ApiClient, root.ApiDocumentation.NewBoardDto, root.ApiDocumentation.UserLoginDto);
  }
}(this, function(ApiClient, NewBoardDto, UserLoginDto) {
  'use strict';

  /**
   * Weathercontroller service.
   * @module api/WeathercontrollerApi
   * @version 1.0
   */

  /**
   * Constructs a new WeathercontrollerApi. 
   * @alias module:api/WeathercontrollerApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the deleteBoardUsingDELETE operation.
     * @callback module:api/WeathercontrollerApi~deleteBoardUsingDELETECallback
     * @param {String} error Error message, if any.
     * @param {'String'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * deleteBoard
     * @param {String} boardId boardId
     * @param {module:api/WeathercontrollerApi~deleteBoardUsingDELETECallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link 'String'}
     */
    this.deleteBoardUsingDELETE = function(boardId, callback) {
      var postBody = null;

      // verify the required parameter 'boardId' is set
      if (boardId === undefined || boardId === null) {
        throw new Error("Missing the required parameter 'boardId' when calling deleteBoardUsingDELETE");
      }


      var pathParams = {
        'boardId': boardId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['*/*'];
      var returnType = 'String';

      return this.apiClient.callApi(
        '/api/{userId}/boards/{boardId}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getBoardUsingGET operation.
     * @callback module:api/WeathercontrollerApi~getBoardUsingGETCallback
     * @param {String} error Error message, if any.
     * @param {'String'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * getBoard
     * @param {String} userId userId
     * @param {String} boardId boardId
     * @param {module:api/WeathercontrollerApi~getBoardUsingGETCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link 'String'}
     */
    this.getBoardUsingGET = function(userId, boardId, callback) {
      var postBody = null;

      // verify the required parameter 'userId' is set
      if (userId === undefined || userId === null) {
        throw new Error("Missing the required parameter 'userId' when calling getBoardUsingGET");
      }

      // verify the required parameter 'boardId' is set
      if (boardId === undefined || boardId === null) {
        throw new Error("Missing the required parameter 'boardId' when calling getBoardUsingGET");
      }


      var pathParams = {
        'userId': userId,
        'boardId': boardId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['*/*'];
      var returnType = 'String';

      return this.apiClient.callApi(
        '/api/{userId}/boards/{boardId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getBoardsUsingGET operation.
     * @callback module:api/WeathercontrollerApi~getBoardsUsingGETCallback
     * @param {String} error Error message, if any.
     * @param {'String'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * getBoards
     * @param {String} userId userId
     * @param {module:api/WeathercontrollerApi~getBoardsUsingGETCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link 'String'}
     */
    this.getBoardsUsingGET = function(userId, callback) {
      var postBody = null;

      // verify the required parameter 'userId' is set
      if (userId === undefined || userId === null) {
        throw new Error("Missing the required parameter 'userId' when calling getBoardsUsingGET");
      }


      var pathParams = {
        'userId': userId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['*/*'];
      var returnType = 'String';

      return this.apiClient.callApi(
        '/api/{userId}/boards', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getLocationByWoeidUsingGET operation.
     * @callback module:api/WeathercontrollerApi~getLocationByWoeidUsingGETCallback
     * @param {String} error Error message, if any.
     * @param {'String'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * getLocationByWoeid
     * @param {String} woeid woeid
     * @param {module:api/WeathercontrollerApi~getLocationByWoeidUsingGETCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link 'String'}
     */
    this.getLocationByWoeidUsingGET = function(woeid, callback) {
      var postBody = null;

      // verify the required parameter 'woeid' is set
      if (woeid === undefined || woeid === null) {
        throw new Error("Missing the required parameter 'woeid' when calling getLocationByWoeidUsingGET");
      }


      var pathParams = {
        'woeid': woeid
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['*/*'];
      var returnType = 'String';

      return this.apiClient.callApi(
        '/api/getLocationByWoeid/{woeid}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getLocationsByNameUsingGET operation.
     * @callback module:api/WeathercontrollerApi~getLocationsByNameUsingGETCallback
     * @param {String} error Error message, if any.
     * @param {'String'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * getLocationsByName
     * @param {String} location location
     * @param {module:api/WeathercontrollerApi~getLocationsByNameUsingGETCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link 'String'}
     */
    this.getLocationsByNameUsingGET = function(location, callback) {
      var postBody = null;

      // verify the required parameter 'location' is set
      if (location === undefined || location === null) {
        throw new Error("Missing the required parameter 'location' when calling getLocationsByNameUsingGET");
      }


      var pathParams = {
        'location': location
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['*/*'];
      var returnType = 'String';

      return this.apiClient.callApi(
        '/api/getLocationByName/{location}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getWeatherByWoeidUsingGET operation.
     * @callback module:api/WeathercontrollerApi~getWeatherByWoeidUsingGETCallback
     * @param {String} error Error message, if any.
     * @param {'String'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * getWeatherByWoeid
     * @param {String} woeid woeid
     * @param {module:api/WeathercontrollerApi~getWeatherByWoeidUsingGETCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link 'String'}
     */
    this.getWeatherByWoeidUsingGET = function(woeid, callback) {
      var postBody = null;

      // verify the required parameter 'woeid' is set
      if (woeid === undefined || woeid === null) {
        throw new Error("Missing the required parameter 'woeid' when calling getWeatherByWoeidUsingGET");
      }


      var pathParams = {
        'woeid': woeid
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['*/*'];
      var returnType = 'String';

      return this.apiClient.callApi(
        '/api/getWeather/{woeid}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the loginUsingPOST operation.
     * @callback module:api/WeathercontrollerApi~loginUsingPOSTCallback
     * @param {String} error Error message, if any.
     * @param {'String'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * login
     * @param {module:model/UserLoginDto} dto dto
     * @param {module:api/WeathercontrollerApi~loginUsingPOSTCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link 'String'}
     */
    this.loginUsingPOST = function(dto, callback) {
      var postBody = dto;

      // verify the required parameter 'dto' is set
      if (dto === undefined || dto === null) {
        throw new Error("Missing the required parameter 'dto' when calling loginUsingPOST");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['*/*'];
      var returnType = 'String';

      return this.apiClient.callApi(
        '/api/login', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the registerUsingPOST operation.
     * @callback module:api/WeathercontrollerApi~registerUsingPOSTCallback
     * @param {String} error Error message, if any.
     * @param {'String'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * register
     * @param {module:model/UserLoginDto} dto dto
     * @param {module:api/WeathercontrollerApi~registerUsingPOSTCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link 'String'}
     */
    this.registerUsingPOST = function(dto, callback) {
      var postBody = dto;

      // verify the required parameter 'dto' is set
      if (dto === undefined || dto === null) {
        throw new Error("Missing the required parameter 'dto' when calling registerUsingPOST");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['*/*'];
      var returnType = 'String';

      return this.apiClient.callApi(
        '/api/register', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the saveBoardUsingPOST operation.
     * @callback module:api/WeathercontrollerApi~saveBoardUsingPOSTCallback
     * @param {String} error Error message, if any.
     * @param {'String'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * saveBoard
     * @param {module:model/NewBoardDto} dto dto
     * @param {String} userId userId
     * @param {module:api/WeathercontrollerApi~saveBoardUsingPOSTCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link 'String'}
     */
    this.saveBoardUsingPOST = function(dto, userId, callback) {
      var postBody = dto;

      // verify the required parameter 'dto' is set
      if (dto === undefined || dto === null) {
        throw new Error("Missing the required parameter 'dto' when calling saveBoardUsingPOST");
      }

      // verify the required parameter 'userId' is set
      if (userId === undefined || userId === null) {
        throw new Error("Missing the required parameter 'userId' when calling saveBoardUsingPOST");
      }


      var pathParams = {
        'userId': userId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['*/*'];
      var returnType = 'String';

      return this.apiClient.callApi(
        '/api/{userId}/boards', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));