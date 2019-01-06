/*
 * BlockMarkets Cryptocurrency API
 * The BlockMarkets API provides real-time and historical market data on cryptocurrencies from the world's leading crypto exchanges. Sign up for a free, unlimited API key at [BlockMarkets Cryptocurrency API](https://www.blockmarkets.io/cryptocurrency-api).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.blockmarkets.rest.api;

import com.blockmarkets.rest.ApiException;
import com.blockmarkets.rest.models.Empty;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * Returns the latest available benchmark rates for a specific asset.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void benchmarkRateTest() throws ApiException {
        String symbol = null;
        Empty response = api.benchmarkRate(symbol);

        // TODO: test validations
    }
    
    /**
     * Returns historical benchmark rates for an asset. Requires premium subscription.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void benchmarkRateHistoryTest() throws ApiException {
        String symbol = null;
        String close = null;
        Empty response = api.benchmarkRateHistory(symbol, close);

        // TODO: test validations
    }
    
    /**
     * Returns a list of all markets (base and quote) for a specific asset.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAssetMarketsTest() throws ApiException {
        String symbol = null;
        Empty response = api.listAssetMarkets(symbol);

        // TODO: test validations
    }
    
    /**
     * Returns a list of supported assets.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAssetsTest() throws ApiException {
        Empty response = api.listAssets();

        // TODO: test validations
    }
    
    /**
     * Returns a list of supported USD benchmark rates.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listBenchmarkRatesTest() throws ApiException {
        Empty response = api.listBenchmarkRates();

        // TODO: test validations
    }
    
    /**
     * Returns a list of markets for a specific exchange.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listExchangeMarketsTest() throws ApiException {
        String exchange = null;
        Empty response = api.listExchangeMarkets(exchange);

        // TODO: test validations
    }
    
    /**
     * Returns a list of supported exchanges.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listExchangesTest() throws ApiException {
        Empty response = api.listExchanges();

        // TODO: test validations
    }
    
    /**
     * Returns a list of supported markets.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMarketsTest() throws ApiException {
        Empty response = api.listMarkets();

        // TODO: test validations
    }
    
    /**
     * Returns a list of markets for a specific asset pair.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPairMarketsTest() throws ApiException {
        String pair = null;
        Empty response = api.listPairMarkets(pair);

        // TODO: test validations
    }
    
    /**
     * Returns a list of supported asset pairs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPairsTest() throws ApiException {
        Empty response = api.listPairs();

        // TODO: test validations
    }
    
    /**
     * Returns a list of supported USD spot rates.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSpotRatesTest() throws ApiException {
        Empty response = api.listSpotRates();

        // TODO: test validations
    }
    
    /**
     * Returns the top 50 bids and asks from the current order book for a market pair. Requires premium subscription.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void marketBookTest() throws ApiException {
        String exchange = null;
        String pair = null;
        Empty response = api.marketBook(exchange, pair);

        // TODO: test validations
    }
    
    /**
     * Returns OHLCV history for a market pair.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void marketOHLCVTest() throws ApiException {
        String exchange = null;
        String pair = null;
        Integer limit = null;
        Integer interval = null;
        String start = null;
        String end = null;
        Empty response = api.marketOHLCV(exchange, pair, limit, interval, start, end);

        // TODO: test validations
    }
    
    /**
     * Returns the latest ticker for a market pair.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void marketTickerTest() throws ApiException {
        String exchange = null;
        String pair = null;
        Empty response = api.marketTicker(exchange, pair);

        // TODO: test validations
    }
    
    /**
     * Returns trades for a market pair. Requires premium subscription.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void marketTradesTest() throws ApiException {
        String exchange = null;
        String pair = null;
        Integer limit = null;
        String start = null;
        String end = null;
        Empty response = api.marketTrades(exchange, pair, limit, start, end);

        // TODO: test validations
    }
    
    /**
     * Returns the last USD spot rate for an asset.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void spotRateTest() throws ApiException {
        String symbol = null;
        Empty response = api.spotRate(symbol);

        // TODO: test validations
    }
    
    /**
     * Returns historical spot rates for an asset. Requires premium subscription.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void spotRateHistoryTest() throws ApiException {
        String symbol = null;
        Integer limit = null;
        String start = null;
        String end = null;
        Empty response = api.spotRateHistory(symbol, limit, start, end);

        // TODO: test validations
    }
    
    /**
     * Returns the OHLCV history for a spot rate.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void spotRateOHLCVTest() throws ApiException {
        String symbol = null;
        Integer limit = null;
        Integer interval = null;
        String start = null;
        String end = null;
        Empty response = api.spotRateOHLCV(symbol, limit, interval, start, end);

        // TODO: test validations
    }
    
}
