     <div class="container">
       <div class="card">
            <div class="header">
                <h4 class="title">Menu Items</h4>
                <p class="category">Add our items to cart</p>
             </div>
                 <div class="content">
                    <div class="panel-group">
                      <div class="row">
                        <div class="col-md-6" ng-repeat="item in menu">
                          <div class="panel panel-default">
                            <div class="panel-heading">
                              <h4 class="panel-title">
                              <a ng-click = "item.isCollapsed = !item.isCollapsed">{{item.Name}}</a>
                              </h4>
                             </div>
                            <div collapse ="item.isCollapsed">
                              <div ng-show="!item.isCollapsed" class="panel-body">
                                <div class="row">
                                  <div class="col-md-4">
                                    <img style="width:100%;height:150px" src="/assets/img/i.jpg"/>
                                  </div>
                                  <div class="col-md-6">
                                    <table class="table">
   
                                      <tbody>
                                       <tr>
                                          <td>Name:</td>
                                          <td>{{item.Name}}</td>
        
                                        </tr>
                                        <tr>
                                          <td>Category:</td>
                                          <td>{{item.Category}}</td>
        
                                        </tr>
                                        <tr>
                                          <td>Unit Price:</td>
                                          <td>{{item.UnitPrice || currency}}</td>
        
                                        </tr>
                                        <tr>
                                          <td>Quantity:</td>
                                          <td><input type="text" ng-model="quantity"></td>
        
                                        </tr>

                                        <tr>
                                          <td>
                                             <button class="btn btn-success" role="button" ng-click="add(item,$index)" ng-disabled="item.add"> 
                                               <span class="glyphicon glyphicon-plus-sign"></span>Add to Cart 
                                             </button>
                                           </td>
                                           <td>
       
                                              <button class="btn btn-danger" role="button" ng-disabled="!item.remove" ng-click="remove(item,$index)"> 
                                                <span class="glyphicon glyphicon-remove"></span> Remove
                                              </button>

                                            </td>
                                          
        
                                        </tr>
                                       
                            
                                      </tbody>
                                    </table>

                                  </div>
                              </div>
                          </div>
                      </div>
                  </div>
              </div>
          </div>
      </div>
      <div class="row" align="center" ng-show="cart.length>0" ng-click="goToCheckOut()">
        <button class="btn btn-success btn-md">Go to Checkout</button>
      </div>
  </div>
</div>
</div>