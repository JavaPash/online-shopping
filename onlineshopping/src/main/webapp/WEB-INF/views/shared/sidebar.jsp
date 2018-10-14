
                <p class="lead">Shop Name</p>
                <div class="list-group">
                    <c:forEach items="${categories}" var="category">
                    <a href="${contextRoot}/show/category/${category.cid}/products" class="list-group-item" id="a_${category.cname}">${category.cname}</a>
                    </c:forEach>
                </div>
