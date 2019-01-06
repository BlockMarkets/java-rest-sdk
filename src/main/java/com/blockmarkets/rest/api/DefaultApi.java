package com.blockmarkets.rest.api;

import com.blockmarkets.rest.ApiException;
import com.blockmarkets.rest.ApiClient;
import com.blockmarkets.rest.ApiResponse;
import com.blockmarkets.rest.Configuration;
import com.blockmarkets.rest.Pair;

import javax.ws.rs.core.GenericType;

import com.blockmarkets.rest.models.Empty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Returns the latest available benchmark rates for a specific asset.
   * 
   * @param symbol The asset symbol (see /assets) (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty benchmarkRate(String symbol) throws ApiException {
    return benchmarkRateWithHttpInfo(symbol).getData();
      }

  /**
   * Returns the latest available benchmark rates for a specific asset.
   * 
   * @param symbol The asset symbol (see /assets) (required)
   * @return ApiResponse&lt;Empty&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> benchmarkRateWithHttpInfo(String symbol) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling benchmarkRate");
    }
    
    // create path and map variables
    String localVarPath = "/v1/rates/benchmark/{symbol}"
      .replaceAll("\\{" + "symbol" + "\\}", apiClient.escapeString(symbol.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Empty> localVarReturnType = new GenericType<Empty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns historical benchmark rates for an asset. Requires premium subscription.
   * 
   * @param symbol The asset symbol (see /assets) (required)
   * @param close The closing time. Options - 4pm-gmt-close, 4pm-est-close, 0-utc-close (optional)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty benchmarkRateHistory(String symbol, String close) throws ApiException {
    return benchmarkRateHistoryWithHttpInfo(symbol, close).getData();
      }

  /**
   * Returns historical benchmark rates for an asset. Requires premium subscription.
   * 
   * @param symbol The asset symbol (see /assets) (required)
   * @param close The closing time. Options - 4pm-gmt-close, 4pm-est-close, 0-utc-close (optional)
   * @return ApiResponse&lt;Empty&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> benchmarkRateHistoryWithHttpInfo(String symbol, String close) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling benchmarkRateHistory");
    }
    
    // create path and map variables
    String localVarPath = "/v1/rates/benchmark/{symbol}/history"
      .replaceAll("\\{" + "symbol" + "\\}", apiClient.escapeString(symbol.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "close", close));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Empty> localVarReturnType = new GenericType<Empty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns a list of all markets (base and quote) for a specific asset.
   * 
   * @param symbol The asset symbol (see /assets) (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty listAssetMarkets(String symbol) throws ApiException {
    return listAssetMarketsWithHttpInfo(symbol).getData();
      }

  /**
   * Returns a list of all markets (base and quote) for a specific asset.
   * 
   * @param symbol The asset symbol (see /assets) (required)
   * @return ApiResponse&lt;Empty&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> listAssetMarketsWithHttpInfo(String symbol) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling listAssetMarkets");
    }
    
    // create path and map variables
    String localVarPath = "/v1/assets/{symbol}"
      .replaceAll("\\{" + "symbol" + "\\}", apiClient.escapeString(symbol.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Empty> localVarReturnType = new GenericType<Empty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns a list of supported assets.
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty listAssets() throws ApiException {
    return listAssetsWithHttpInfo().getData();
      }

  /**
   * Returns a list of supported assets.
   * 
   * @return ApiResponse&lt;Empty&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> listAssetsWithHttpInfo() throws ApiException {
    Object localVarPostBody = new Object();
    
    // create path and map variables
    String localVarPath = "/v1/assets";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Empty> localVarReturnType = new GenericType<Empty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns a list of supported USD benchmark rates.
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty listBenchmarkRates() throws ApiException {
    return listBenchmarkRatesWithHttpInfo().getData();
      }

  /**
   * Returns a list of supported USD benchmark rates.
   * 
   * @return ApiResponse&lt;Empty&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> listBenchmarkRatesWithHttpInfo() throws ApiException {
    Object localVarPostBody = new Object();
    
    // create path and map variables
    String localVarPath = "/v1/rates/benchmark";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Empty> localVarReturnType = new GenericType<Empty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns a list of markets for a specific exchange.
   * 
   * @param exchange The 4-char exchange code (see /exchanges) (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty listExchangeMarkets(String exchange) throws ApiException {
    return listExchangeMarketsWithHttpInfo(exchange).getData();
      }

  /**
   * Returns a list of markets for a specific exchange.
   * 
   * @param exchange The 4-char exchange code (see /exchanges) (required)
   * @return ApiResponse&lt;Empty&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> listExchangeMarketsWithHttpInfo(String exchange) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'exchange' is set
    if (exchange == null) {
      throw new ApiException(400, "Missing the required parameter 'exchange' when calling listExchangeMarkets");
    }
    
    // create path and map variables
    String localVarPath = "/v1/exchanges/{exchange}"
      .replaceAll("\\{" + "exchange" + "\\}", apiClient.escapeString(exchange.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Empty> localVarReturnType = new GenericType<Empty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns a list of supported exchanges.
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty listExchanges() throws ApiException {
    return listExchangesWithHttpInfo().getData();
      }

  /**
   * Returns a list of supported exchanges.
   * 
   * @return ApiResponse&lt;Empty&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> listExchangesWithHttpInfo() throws ApiException {
    Object localVarPostBody = new Object();
    
    // create path and map variables
    String localVarPath = "/v1/exchanges";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Empty> localVarReturnType = new GenericType<Empty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns a list of supported markets.
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty listMarkets() throws ApiException {
    return listMarketsWithHttpInfo().getData();
      }

  /**
   * Returns a list of supported markets.
   * 
   * @return ApiResponse&lt;Empty&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> listMarketsWithHttpInfo() throws ApiException {
    Object localVarPostBody = new Object();
    
    // create path and map variables
    String localVarPath = "/v1/markets";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Empty> localVarReturnType = new GenericType<Empty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns a list of markets for a specific asset pair.
   * 
   * @param pair The asset pair (see /pairs) (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty listPairMarkets(String pair) throws ApiException {
    return listPairMarketsWithHttpInfo(pair).getData();
      }

  /**
   * Returns a list of markets for a specific asset pair.
   * 
   * @param pair The asset pair (see /pairs) (required)
   * @return ApiResponse&lt;Empty&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> listPairMarketsWithHttpInfo(String pair) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'pair' is set
    if (pair == null) {
      throw new ApiException(400, "Missing the required parameter 'pair' when calling listPairMarkets");
    }
    
    // create path and map variables
    String localVarPath = "/v1/pairs/{pair}"
      .replaceAll("\\{" + "pair" + "\\}", apiClient.escapeString(pair.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Empty> localVarReturnType = new GenericType<Empty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns a list of supported asset pairs.
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty listPairs() throws ApiException {
    return listPairsWithHttpInfo().getData();
      }

  /**
   * Returns a list of supported asset pairs.
   * 
   * @return ApiResponse&lt;Empty&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> listPairsWithHttpInfo() throws ApiException {
    Object localVarPostBody = new Object();
    
    // create path and map variables
    String localVarPath = "/v1/pairs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Empty> localVarReturnType = new GenericType<Empty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns a list of supported USD spot rates.
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty listSpotRates() throws ApiException {
    return listSpotRatesWithHttpInfo().getData();
      }

  /**
   * Returns a list of supported USD spot rates.
   * 
   * @return ApiResponse&lt;Empty&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> listSpotRatesWithHttpInfo() throws ApiException {
    Object localVarPostBody = new Object();
    
    // create path and map variables
    String localVarPath = "/v1/rates/spot";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Empty> localVarReturnType = new GenericType<Empty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns the top 50 bids and asks from the current order book for a market pair. Requires premium subscription.
   * 
   * @param exchange The 4-char exchange code (see /exchanges) (required)
   * @param pair The asset pair (see /pairs) (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty marketBook(String exchange, String pair) throws ApiException {
    return marketBookWithHttpInfo(exchange, pair).getData();
      }

  /**
   * Returns the top 50 bids and asks from the current order book for a market pair. Requires premium subscription.
   * 
   * @param exchange The 4-char exchange code (see /exchanges) (required)
   * @param pair The asset pair (see /pairs) (required)
   * @return ApiResponse&lt;Empty&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> marketBookWithHttpInfo(String exchange, String pair) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'exchange' is set
    if (exchange == null) {
      throw new ApiException(400, "Missing the required parameter 'exchange' when calling marketBook");
    }
    
    // verify the required parameter 'pair' is set
    if (pair == null) {
      throw new ApiException(400, "Missing the required parameter 'pair' when calling marketBook");
    }
    
    // create path and map variables
    String localVarPath = "/v1/markets/{exchange}/{pair}/book"
      .replaceAll("\\{" + "exchange" + "\\}", apiClient.escapeString(exchange.toString()))
      .replaceAll("\\{" + "pair" + "\\}", apiClient.escapeString(pair.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Empty> localVarReturnType = new GenericType<Empty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns OHLCV history for a market pair.
   * 
   * @param exchange The 4-char exchange code (see /exchanges) (required)
   * @param pair The asset pair (see /pairs) (required)
   * @param limit Number of records to retrieve (default&#x3D;100, max&#x3D;1000) (optional)
   * @param interval Interval period in minutes. Supported - 1,3,5,15,30,60,1440 (default&#x3D;1440) (optional)
   * @param start Start datetime in ISO 8601 (optional)
   * @param end End datetime in ISO 8601 (optional)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty marketOHLCV(String exchange, String pair, Integer limit, Integer interval, String start, String end) throws ApiException {
    return marketOHLCVWithHttpInfo(exchange, pair, limit, interval, start, end).getData();
      }

  /**
   * Returns OHLCV history for a market pair.
   * 
   * @param exchange The 4-char exchange code (see /exchanges) (required)
   * @param pair The asset pair (see /pairs) (required)
   * @param limit Number of records to retrieve (default&#x3D;100, max&#x3D;1000) (optional)
   * @param interval Interval period in minutes. Supported - 1,3,5,15,30,60,1440 (default&#x3D;1440) (optional)
   * @param start Start datetime in ISO 8601 (optional)
   * @param end End datetime in ISO 8601 (optional)
   * @return ApiResponse&lt;Empty&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> marketOHLCVWithHttpInfo(String exchange, String pair, Integer limit, Integer interval, String start, String end) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'exchange' is set
    if (exchange == null) {
      throw new ApiException(400, "Missing the required parameter 'exchange' when calling marketOHLCV");
    }
    
    // verify the required parameter 'pair' is set
    if (pair == null) {
      throw new ApiException(400, "Missing the required parameter 'pair' when calling marketOHLCV");
    }
    
    // create path and map variables
    String localVarPath = "/v1/markets/{exchange}/{pair}/ohlcv"
      .replaceAll("\\{" + "exchange" + "\\}", apiClient.escapeString(exchange.toString()))
      .replaceAll("\\{" + "pair" + "\\}", apiClient.escapeString(pair.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "interval", interval));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Empty> localVarReturnType = new GenericType<Empty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns the latest ticker for a market pair.
   * 
   * @param exchange The 4-char exchange code (see /exchanges) (required)
   * @param pair The asset pair (see /pairs) (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty marketTicker(String exchange, String pair) throws ApiException {
    return marketTickerWithHttpInfo(exchange, pair).getData();
      }

  /**
   * Returns the latest ticker for a market pair.
   * 
   * @param exchange The 4-char exchange code (see /exchanges) (required)
   * @param pair The asset pair (see /pairs) (required)
   * @return ApiResponse&lt;Empty&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> marketTickerWithHttpInfo(String exchange, String pair) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'exchange' is set
    if (exchange == null) {
      throw new ApiException(400, "Missing the required parameter 'exchange' when calling marketTicker");
    }
    
    // verify the required parameter 'pair' is set
    if (pair == null) {
      throw new ApiException(400, "Missing the required parameter 'pair' when calling marketTicker");
    }
    
    // create path and map variables
    String localVarPath = "/v1/markets/{exchange}/{pair}"
      .replaceAll("\\{" + "exchange" + "\\}", apiClient.escapeString(exchange.toString()))
      .replaceAll("\\{" + "pair" + "\\}", apiClient.escapeString(pair.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Empty> localVarReturnType = new GenericType<Empty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns trades for a market pair. Requires premium subscription.
   * 
   * @param exchange The 4-char exchange code (see /exchanges) (required)
   * @param pair The asset pair (see /pairs) (required)
   * @param limit Number of records to retrieve (default&#x3D;100, max&#x3D;1000) (optional)
   * @param start Start datetime in ISO 8601 (optional)
   * @param end End datetime in ISO 8601 (optional)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty marketTrades(String exchange, String pair, Integer limit, String start, String end) throws ApiException {
    return marketTradesWithHttpInfo(exchange, pair, limit, start, end).getData();
      }

  /**
   * Returns trades for a market pair. Requires premium subscription.
   * 
   * @param exchange The 4-char exchange code (see /exchanges) (required)
   * @param pair The asset pair (see /pairs) (required)
   * @param limit Number of records to retrieve (default&#x3D;100, max&#x3D;1000) (optional)
   * @param start Start datetime in ISO 8601 (optional)
   * @param end End datetime in ISO 8601 (optional)
   * @return ApiResponse&lt;Empty&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> marketTradesWithHttpInfo(String exchange, String pair, Integer limit, String start, String end) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'exchange' is set
    if (exchange == null) {
      throw new ApiException(400, "Missing the required parameter 'exchange' when calling marketTrades");
    }
    
    // verify the required parameter 'pair' is set
    if (pair == null) {
      throw new ApiException(400, "Missing the required parameter 'pair' when calling marketTrades");
    }
    
    // create path and map variables
    String localVarPath = "/v1/markets/{exchange}/{pair}/trades"
      .replaceAll("\\{" + "exchange" + "\\}", apiClient.escapeString(exchange.toString()))
      .replaceAll("\\{" + "pair" + "\\}", apiClient.escapeString(pair.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Empty> localVarReturnType = new GenericType<Empty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns the last USD spot rate for an asset.
   * 
   * @param symbol The asset symbol (see /assets) (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty spotRate(String symbol) throws ApiException {
    return spotRateWithHttpInfo(symbol).getData();
      }

  /**
   * Returns the last USD spot rate for an asset.
   * 
   * @param symbol The asset symbol (see /assets) (required)
   * @return ApiResponse&lt;Empty&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> spotRateWithHttpInfo(String symbol) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling spotRate");
    }
    
    // create path and map variables
    String localVarPath = "/v1/rates/spot/{symbol}"
      .replaceAll("\\{" + "symbol" + "\\}", apiClient.escapeString(symbol.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Empty> localVarReturnType = new GenericType<Empty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns historical spot rates for an asset. Requires premium subscription.
   * 
   * @param symbol The asset symbol (see /assets) (required)
   * @param limit Number of records to retrieve (default&#x3D;100, max&#x3D;1000) (optional)
   * @param start Start datetime in ISO 8601 (optional)
   * @param end End datetime in ISO 8601 (optional)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty spotRateHistory(String symbol, Integer limit, String start, String end) throws ApiException {
    return spotRateHistoryWithHttpInfo(symbol, limit, start, end).getData();
      }

  /**
   * Returns historical spot rates for an asset. Requires premium subscription.
   * 
   * @param symbol The asset symbol (see /assets) (required)
   * @param limit Number of records to retrieve (default&#x3D;100, max&#x3D;1000) (optional)
   * @param start Start datetime in ISO 8601 (optional)
   * @param end End datetime in ISO 8601 (optional)
   * @return ApiResponse&lt;Empty&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> spotRateHistoryWithHttpInfo(String symbol, Integer limit, String start, String end) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling spotRateHistory");
    }
    
    // create path and map variables
    String localVarPath = "/v1/rates/spot/{symbol}/history"
      .replaceAll("\\{" + "symbol" + "\\}", apiClient.escapeString(symbol.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Empty> localVarReturnType = new GenericType<Empty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns the OHLCV history for a spot rate.
   * 
   * @param symbol The asset symbol (see /assets) (required)
   * @param limit Number of records to retrieve (default&#x3D;100, max&#x3D;1000) (optional)
   * @param interval Interval period in minutes. Supported -  1,3,5,15,30,60,1440 (default&#x3D;1440) (optional)
   * @param start Start datetime in ISO 8601 (optional)
   * @param end End datetime in ISO 8601 (optional)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty spotRateOHLCV(String symbol, Integer limit, Integer interval, String start, String end) throws ApiException {
    return spotRateOHLCVWithHttpInfo(symbol, limit, interval, start, end).getData();
      }

  /**
   * Returns the OHLCV history for a spot rate.
   * 
   * @param symbol The asset symbol (see /assets) (required)
   * @param limit Number of records to retrieve (default&#x3D;100, max&#x3D;1000) (optional)
   * @param interval Interval period in minutes. Supported -  1,3,5,15,30,60,1440 (default&#x3D;1440) (optional)
   * @param start Start datetime in ISO 8601 (optional)
   * @param end End datetime in ISO 8601 (optional)
   * @return ApiResponse&lt;Empty&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> spotRateOHLCVWithHttpInfo(String symbol, Integer limit, Integer interval, String start, String end) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling spotRateOHLCV");
    }
    
    // create path and map variables
    String localVarPath = "/v1/rates/spot/{symbol}/ohlcv"
      .replaceAll("\\{" + "symbol" + "\\}", apiClient.escapeString(symbol.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "interval", interval));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Empty> localVarReturnType = new GenericType<Empty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
